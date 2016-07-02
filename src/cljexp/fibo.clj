(ns cljexp.fibo)

(defn fibo
  [input]
  (loop [x input]
    (if (or (= x 0) (= x 1))
      1
      (recur (+ (fibo (dec x)) (fibo (dec (dec x))))))))