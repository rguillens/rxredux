package com.fred.rxredux.transformers;

import io.reactivex.ObservableTransformer;

/**
 * A scheduler transformer is an rx transformer that changes the stream schedulers to other
 * schedulers.
 *
 * The idea behind this transformer is to remove a lot of boiler plate code and on top of that make
 * it easier for us to inject different scheduler transformers for testing.
 */
public interface SchedulerTransformer {

  <T> ObservableTransformer<T, T> applyObservableSchedulers();
}
