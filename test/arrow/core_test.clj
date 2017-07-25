(ns arrow.core-test
  (:require [midje.sweet :refer :all]
            [arrow.core :refer :all]))

(facts "about `increment-and-listify`"
  (fact "takes a single element vector, increments the element, and returns it as a list"
    (increment-and-listify [1]) => '(2)
    (increment-and-listify [-1]) => '(0)))

(facts "about `increment-multiply-and-listify`"
  (fact "takes a single element vector, increments the element, multiplies it by 3, and returns it as a list"
    (increment-multiply-and-listify [1]) => '(6)
    (increment-multiply-and-listify [-1]) => '(0)))

(facts "about `double-and-increment`"
  (fact "doubles a number, then increments it"
    (double-and-increment 4) => 9
    (double-and-increment -3) => -5))

(facts "about `arbitrary-sum`"
  (fact "calculates an arbitrary sum requested by the exercise"
    (arbitrary-sum) => 13))
