(ns cljexp.add
  ;(:require [clojure.math.numeric-tower :as math])
  )

(defn add
  [x y]
  (cond (= 0 x) y
        (= 0 y) x
        (< x y)  (add (dec x) (inc y))
        (< y x)  (add (inc x) (dec y))))

(defn naive-add
  [x y]
  (if (= 0 x)
    y
    (add (dec x) (inc y))))