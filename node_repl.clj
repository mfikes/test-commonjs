(require 'cljs.repl)
(require 'cljs.repl.node)

(cljs.repl/repl (cljs.repl.node/repl-env)
  :output-dir "out"
  :foreign-libs [{:file "libs/greeting.js"
                  :provides ["greeting"]
                  :module-type :commonjs}
                 {:file "libs/german.js"
                  :provides ["german"]
                  :module-type :commonjs}])
