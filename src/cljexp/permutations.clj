(ns cljexp.permutations)

(defn perms
  [prefix characters]
  (if (= (count characters) 1)
    (list (str prefix (first characters)))
    (map perms
         (map #(str prefix %1) characters)
         (map #(clojure.string/replace-first characters %1 "") characters))))

(defn permutations
  [characters]
  (flatten (perms "" characters)))
