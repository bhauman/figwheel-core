## figwheel-core

Contains the core functionality of Figwheel.

This allows you to get the benefits of figwheel's hot reloading and
feedback cycle without being complected with a server or a REPL
implementation.

# Usage

Experts only at this point

Add `figwheel-core` to your deps and then:

```
clj -m cljs.main -w src -e "(require '[figwheel.core :include-macros true])(figwheel.core/hook-cljs-build)(figwheel.core/start-from-repl)" -r
```

## License

Copyright © 2018 Bruce Hauman

Distributed under the Eclipse Public License either version 1.0 or any
later version.
