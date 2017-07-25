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
        
