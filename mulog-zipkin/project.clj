(defn ver [] (-> "../ver/mulog.version" slurp .trim))
(defproject com.brunobonacci/mulog-zipkin #=(ver)
  :description "A publisher for μ/trace to OpenZipkin."

  :url "https://github.com/BrunoBonacci/mulog"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :scm {:name "git" :url "https://github.com/BrunoBonacci/mulog.git"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.brunobonacci/mulog #=(ver)]
                 [clj-http "3.10.0"]
                 [cheshire "5.10.0"]
                 [clj-time "0.15.2"]]

  :global-vars {*warn-on-reflection* true}

  :java-cmd "/Library/Java/JavaVirtualMachines/graalvm-ce-java8-19.3.0.2/Contents/Home/bin/java"
  :jvm-opts ["-server"]

  :profiles {:dev {:dependencies [[midje "1.9.9"]
                                  [org.clojure/test.check "1.0.0"]
                                  [criterium "0.4.5"]
                                  [org.slf4j/slf4j-log4j12 "2.0.0-alpha1"]]
                   :resource-paths ["dev-resources"]
                   :plugins      [[lein-midje "3.2.2"]]}}
  )