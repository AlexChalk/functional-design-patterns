(ns arrow.core)

(def increment-and-listify
  (fn [vector]
    (-> vector
        first
        inc
        list)))
      
(def increment-multiply-and-listify
  (fn [vector]
    (-> vector
        first
        inc
        (* 3)
        list)))
        
(def double-and-increment
  (fn [integer]
    (-> integer
        ((fn [n] (* 2 n)))
        inc))) 

(def arbitrary-sum
  (fn []
   (-> (+ 1 2)
       (* 3)
       (+ 4))))
