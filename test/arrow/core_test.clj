(ns arrow.core-test
  (:require [midje.sweet :refer :all]
            [arrow.core :refer :all]))

(facts "about `increment-and-listify`"
  (fact "takes a single element vector, increments the element, and returns it as a list"
    (increment-and-listify [1]) => '(2)
    (increment-and-listify [-1]) => '(0)))
