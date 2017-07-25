(ns arrow.core)

(def increment-and-listify
  (fn [vector]
    (-> vector
        first
        inc
        list)))
      
