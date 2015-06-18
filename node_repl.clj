(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(def foreign-libs [{:file "libs/greeting.js"
       :provides ["greeting"]
       :module-type :commonjs}
      {:file "libs/german.js"
       :provides ["german"]
       :module-type :commonjs}])

(cljs.build.api/build "src"
  {:main 'foo.bar
   :output-to "out/main.js"
   :verbose true
   :foreign-libs foreign-libs})

(cljs.repl/repl (cljs.repl.node/repl-env)
  :watch "src"
  :output-dir "out"
  :foreign-libs foreign-libs)
