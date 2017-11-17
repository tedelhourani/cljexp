(ns cljexp.core
  (:require [cljexp.fixed-point :as fixed-point]
            [cljexp.add :as add]
            [cljexp.fibo :as fibo]
            [cljexp.pair :as pair]
            [cljexp.permutations :as permutations]))

(defn -main
  [& args]
  ;(println (fixed-point/simpler-sqrt 3653654364565376))
  ;(println (add/add 222877679898 6845))
  ;(println (pair/pair 4 6)))
  (println (permutations/permutations "abcd")))
