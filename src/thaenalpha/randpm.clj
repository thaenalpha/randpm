(ns thaenalpha.randpm
  (:gen-class))

(defn -main
  "Random windows package managers"
  []
  (println (rand-nth ["winget" "choco" "scoop"])))
