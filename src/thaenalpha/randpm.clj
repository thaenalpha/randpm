(ns thaenalpha.randpm)

(defn -main
  "Random windows package managers"
  []
  (println (rand-nth ["winget" "choco" "scoop"])))

(defn crypto
  "Random Crypto currencies"
  [opts]
  (println (rand-nth ["BTC" "ETH" "LINK" "BNB" "TRX" "DOT" "EOS" "LTC" "BCH" "XRP" "ETC" "FIL" "ADA"
                      "burger" "ont" "cake" "btt" "zil" "xlm" "jfin" "crv" "doge" "sand" "rune" "unfi" "OMG"
                      "fet" "xvs" "alpha" "fio" "icp" "Theta" "waves"])))

(defn archive-format
  "Random Oh-My-Zsh Universal archive plugin format"
  [opts]
  (println (rand-nth ["7z" "bz2" "gz" "lzma" "lzo" "rar" "tar" "tbz" "tgz" "tlz"
                      "txz" "tZ" "xz" "Z" "zip" "zst"])))
