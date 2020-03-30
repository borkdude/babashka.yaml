(defproject borkdude/clj-yaml "0.8.0-SNAPSHOT"
  :description "YAML encoding and decoding for Clojure using SnakeYAML"
  :url "https://github.com/clj-commons/clj-yaml"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "Same as Clojure"}
  ;; Emit warnings on all reflection calls.
  :global-vars {*warn-on-reflection* true}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :dependencies
  [[org.yaml/snakeyaml "1.25"]
   [frankiesardo/linked "1.3.0"]]
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.10.1"]]}}
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]])
