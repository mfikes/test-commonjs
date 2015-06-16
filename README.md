# test-commonjs
Testing ClojureScript CommonJS support

Uses QuickStart

1. Build `cljs.jar` and copy here
2. `rlwrap java -cp cljs.jar:src clojure.main node_repl.clj`
3. Load the `foo.bar` namespace

```clojure
(require 'foo.bar)
```
