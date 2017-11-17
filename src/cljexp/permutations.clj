(ns cljexp.permutations)

(defn perms
  [prefix characters]
  (if (= (count characters) 1)
    (str prefix (first characters))
    (map (fn [args] (apply perms args))
         (map (partial
               (fn [prefix characters character]
                 (list (str prefix character) (clojure.string/replace-first characters character "")))
               prefix characters)
              characters))))

;; ugly get all permutations
(defn permutations
  [characters]
  (flatten (perms "" characters)))
