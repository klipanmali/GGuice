package com.mycompany.app.customescope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.inject.Key;
import com.google.inject.OutOfScopeException;
import com.google.inject.Provider;
import com.google.inject.Scope;
import com.google.inject.Scopes;

public class SimpleMinuteScope implements Scope {

	private Map<Key<?>, Object> scopedValues;

	@Override
	public <T> Provider<T> scope(final Key<T> key, final Provider<T> unscoped) {
		return new Provider<T>() {

			@Override
			public T get() {
				Map<Key<?>, Object> scopedObjects = getScopedObjectMap();

				@SuppressWarnings("unchecked")
				T current = (T) scopedObjects.get(key);
				if (Objects.isNull(current)) {
					current = unscoped.get();

					// don't remember proxies: these exists only to serve circular dependencies
					if (Scopes.isCircularProxy(current)) {
						return current;
					}
					scopedObjects.put(key, current);
				}
				return current;
			}
		};

	}

	public void enter() {
		if (Objects.nonNull(scopedValues)) {
			System.out.println("!!!! A scoping block already in progress");
		}
		setScopedObjectMap(new HashMap<>());
	}

	public void exit() {
		if (Objects.isNull(scopedValues)) {
			System.out.println("!!! You are alreaddy out of scope");
		}
		setScopedObjectMap(null);
	}

	public <T> void seed(Key<T> key, T value) {
		Map<Key<?>, Object> scopedObjects = getScopedObjectMap();
		if (scopedObjects.containsKey(key)) {
			System.out.println("Key already inserted in scoped Values");
		}
		addScopedObject(key, value);
	}

	public <T> void seed(Class<T> clazz, T value) {
		seed(Key.get(clazz), value);
	}

	private synchronized Map<Key<?>, Object> getScopedObjectMap() {
		if (scopedValues == null) {
			throw new OutOfScopeException("Cannot access, out of the scope");
		}
		return scopedValues;
	}

	private synchronized void setScopedObjectMap(Map<Key<?>, Object> scopedObjects) {
		scopedValues = scopedObjects;
	}

	private synchronized <T> void addScopedObject(Key<T> key, T value) {
		scopedValues.put(key, value);
	}

}
