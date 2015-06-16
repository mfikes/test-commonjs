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
/Users/mfikes/Projects/test-commonjs/out/foo/bar.js:6
cljs.core.println.call(null,module$libs$greeting.hello.call(null,"Welt!"));
                                                      ^
TypeError: Cannot read property 'call' of undefined
    at Object.<anonymous> (/Users/mfikes/Projects/test-commonjs/out/foo/bar.js:6:55)
    at Module._compile (module.js:460:26)
    at Object.Module._extensions..js (module.js:478:10)
    at Module.load (module.js:355:32)
    at Function.Module._load (module.js:310:12)
    at Module.require (module.js:365:17)
    at require (module.js:384:17)
    at global.CLOSURE_IMPORT_SCRIPT (repl:75:16)
    at Object.goog.require (repl:19:60)
    at repl:5:6
```
