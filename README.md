# test-commonjs
Testing ClojureScript CommonJS support

Uses QuickStart

1. Build `cljs.jar` and copy here
2. `rlwrap java -cp cljs.jar:src clojure.main node_repl.clj`
3. Load the `foo.bar` namespace

```clojure
(require 'foo.bar)
```

```
clojure.lang.ExceptionInfo: No such namespace: greeting, could not locate greeting.cljs, greeting.cljc, or Closure namespace "greeting" at line 1 file:/Users/mfikes/Projects/test-commonjs/src/foo/bar.cljs {:file #object[java.net.URL 0x19b02dfd "file:/Users/mfikes/Projects/test-commonjs/src/foo/bar.cljs"], :line 1, :column 1, :tag :cljs/analysis-error}
	at clojure.core$ex_info.invoke(core.clj:4591)
	at cljs.analyzer$error.invoke(analyzer.cljc:442)
	at cljs.analyzer$error.invoke(analyzer.cljc:440)
	at cljs.analyzer$analyze_deps.invoke(analyzer.cljc:1368)
	at cljs.analyzer$fn__1351.invoke(analyzer.cljc:1632)
	at clojure.lang.MultiFn.invoke(MultiFn.java:251)
	at cljs.analyzer$analyze_seq.invoke(analyzer.cljc:1999)
	at cljs.analyzer$analyze$fn__1578.invoke(analyzer.cljc:2091)
	at cljs.analyzer$analyze.invoke(analyzer.cljc:2084)
	at cljs.analyzer$parse_ns$fn__1606$fn__1607.invoke(analyzer.cljc:2216)
	at cljs.analyzer$parse_ns$fn__1606.invoke(analyzer.cljc:2216)
	at cljs.analyzer$parse_ns.invoke(analyzer.cljc:2197)
	at cljs.analyzer$parse_ns.invoke(analyzer.cljc:2189)
	at cljs.analyzer$analyze_file.invoke(analyzer.cljc:2348)
	at cljs.analyzer$analyze_deps.invoke(analyzer.cljc:1366)
	at cljs.analyzer$fn__1351.invoke(analyzer.cljc:1632)
	at clojure.lang.MultiFn.invoke(MultiFn.java:251)
	at cljs.analyzer$analyze_seq.invoke(analyzer.cljc:1999)
	at cljs.analyzer$analyze$fn__1578.invoke(analyzer.cljc:2091)
	at cljs.analyzer$analyze.invoke(analyzer.cljc:2084)
	at cljs.repl$evaluate_form.invoke(repl.cljc:429)
	at cljs.repl$fn__4331$self__4343.invoke(repl.cljc:641)
	at cljs.repl$repl_STAR_$read_eval_print__4396.invoke(repl.cljc:821)
	at cljs.repl$repl_STAR_$fn__4402$fn__4409.invoke(repl.cljc:860)
	at cljs.repl$repl_STAR_$fn__4402.invoke(repl.cljc:859)
	at cljs.compiler$with_core_cljs.invoke(compiler.cljc:1029)
	at cljs.repl$repl_STAR_.invoke(repl.cljc:825)
	at cljs.repl$repl.doInvoke(repl.cljc:941)
	at clojure.lang.RestFn.invoke(RestFn.java:486)
	at user$eval32.invoke(node_repl.clj:17)
	at clojure.lang.Compiler.eval(Compiler.java:6792)
	at clojure.lang.Compiler.load(Compiler.java:7237)
	at clojure.lang.Compiler.loadFile(Compiler.java:7175)
	at clojure.main$load_script.invoke(main.clj:275)
	at clojure.main$script_opt.invoke(main.clj:337)
	at clojure.main$main.doInvoke(main.clj:421)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.lang.Var.invoke(Var.java:379)
	at clojure.lang.AFn.applyToHelper(AFn.java:154)
	at clojure.lang.Var.applyTo(Var.java:700)
	at clojure.main.main(main.java:37)
```
