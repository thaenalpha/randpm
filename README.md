# randpm

The Simple Clojure app that gives one of the Windows Package Manager's name (Winget, Choco or Scoop) to make it eaiser to make a choice.

## Prerequisite

Clojure https://clojure.org (If you're from Windows, you can also look at https://github.com/littleli/scoop-clojure)

## Installation

Download from https://github.com/thaenalpha/randpm

## Usage

Run the project directly, via `:main-opts` (`-m thaenalpha.randpm`):

    $ clojure -M:run-m
    winget

Run the project's tests (they'll fail until you edit them):

    $ clojure -M:test:runner

Build an uberjar:

    $ clojure -X:uberjar

This will update the generated `pom.xml` file to keep the dependencies synchronized with
your `deps.edn` file. You can update the version (and SCM tag) information in the `pom.xml` using the
`:version` argument:

    $ clojure -X:uberjar :version '"1.2.3"'

If you don't want the `pom.xml` file in your project, you can remove it, but you will
also need to remove `:sync-pom true` from the `deps.edn` file (in the `:exec-args` for `depstar`).

Run that uberjar:

    $ java -jar randpm.jar

## Examples

    $ clojure -M:run-m
    winget
    $ clojure -M:run-m
    choco
    $ clojure -M:run-m
    choco
    $ clojure -M:run-m
    winget
    $ clojure -M:run-m
    choco
    $ clojure -M:run-m
    winget
    $ clojure -M:run-m
    scoop

## License

Copyright © 2021 Nopanun Laochunhanun

Distributed under the Eclipse Public License version 1.0.
