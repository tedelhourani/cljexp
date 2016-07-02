(ns cljexp.fixed-point
  (:require [clojure.math.numeric-tower :as math]))

(defn good-enough
  [guess x fixed-point-function]
  (if (> 0.000001 (math/abs (- guess (fixed-point-function x guess))))
    true
    false))

(defn guess-fixed-point
  [x guess fixed-point-function]
  (if (good-enough guess x fixed-point-function)
    guess
    (guess-fixed-point x (fixed-point-function x guess) fixed-point-function)))

(defn sqrt-fixed-point-function
  [x guess]
  (double (/ (+  guess (/ x guess)) 2)))

(defn sqrt
  [x]
  (guess-fixed-point x 1 sqrt-fixed-point-function))

;; simpler fixed-point uses anonymous function to embed x in the fixed-point function
(defn simpler-good-enough
  [guess fixed-point-function]
  (if (> 0.000001 (math/abs (- guess (fixed-point-function guess))))
    true
    false))

(defn simpler-guess-fixed-point
  [guess fixed-point-function]
  (if (simpler-good-enough guess fixed-point-function)
    guess
    (simpler-guess-fixed-point (fixed-point-function guess) fixed-point-function)))

(defn simpler-sqrt
  [x]
  (simpler-guess-fixed-point
   1
   (fn [guess] (double (/ (+  guess (/ x guess)) 2)))))