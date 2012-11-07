Gremlin-Android
===============

![Feature Image](https://github.com/wuman/gremlin-android/raw/master/doc/images/gremlin-logo.png)

Gremlin-Android is a port of [Gremlin](https://github.com/tinkerpop/gremlin)
for the Android platform. It is still under development so use it at your
own risk. Currently only gremlin-android-java is supported because I have
not yet been able to port groovy on Android. I have heard of projects like
[discobot](http://code.google.com/p/discobot/) but as far as I know the
project has little to none activity now. You may refer to Gremlin's
[Java usage](https://github.com/tinkerpop/gremlin/wiki/Using-Gremlin-through-Java)
page.


Including in Your Project
-------------------------

There are two ways to include the library in your projects:

1. You can download the released jar file in the [Downloads section](https://github.com/wuman/gremlin-android/downloads).
2. If you use Maven to build your project you can simply add a dependency to 
   the desired component of the library.

        <dependency>
            <groupId>com.wu-man</groupId>
            <artifactId>gremlin-android-java</artifactId>
            <version>2.1.0.0</version>
        </dependency>


What is Gremlin
---------------

Gremlin is a domain specific language for traversing property 
[graphs](http://en.wikipedia.org/wiki/Graph_%28mathematics%29). Gremlin makes 
use of [Pipes](http://pipes.tinkerpop.com) to perform complex graph traversals. 
This language has application in the areas of graph query, analysis, and 
manipulation. Connectors, provided by [Blueprints](http://blueprints.tinkerpop.com)
and [Blueprints-Android](http://wuman.github.com/blueprints-android/), exist 
for the following graph management systems:

* Graph database connectivity:
    * [TinkerGraph](https://github.com/tinkerpop/blueprints/wiki/TinkerGraph) in-memory graph
    * [Neo4j](http://neo4j.org/) graph database
    * [OrientDB](http://www.orientechnologies.com/) graph database
    * [DEX](http://www.sparsity-technologies.com/dex) graph database
    * [InfiniteGraph](http://www.infinitegraph.com/) graph database
    * [Titan](http://thinkaurelius.github.com/titan/) graph database
    * [Rexster](http://rexster.tinkerpop.com) graph server
    * [Sesame 2.0](http://www.openrdf.org) compliant RDF stores
* Supporting extensions:
    * [GraphML Reader/Writer](http://graphml.graphdrawing.org/) library
    * [GraphSON Reader/Writer](http://www.json.org/) library
    * [GML Reader/Writer](http://en.wikipedia.org/wiki/Graph_Modelling_Language) library
    * [Java Universal/Graph](http://jung.sourceforge.net/) framework
* JVM language connectivity:
    * [Java](http://java.com/): Gremlin in the Java Language
    * [Groovy](http://groovy.codehaus.org/): Gremlin in the Groovy Language
    * Easy to connect to other [JVM languages](http://en.wikipedia.org/wiki/List_of_JVM_languages)

The documentation for Gremlin can be found at this [location](http://gremlin.tinkerpop.com). 
Finally, please visit [TinkerPop](http://tinkerpop.com) for other software products.


Developed By
------------

* Android porting contributor
    * David Wu - <david@wu-man.com> - [http://blog.wu-man.com](http://blog.wu-man.com)
* Original contributor to Gremlin
    * Marko A. Rodriguez - <marko@markorodriguez.com> - http://markorodriguez.com


License
-------

    Copyright 2012, David Wu
    Copyright (c) 2009-2012, TinkerPop [http://tinkerpop.com]
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:
        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of the TinkerPop nor the
          names of its contributors may be used to endorse or promote products
          derived from this software without specific prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
    ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
    DISCLAIMED. IN NO EVENT SHALL TINKERPOP BE LIABLE FOR ANY
    DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
    (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
    ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
    (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
    SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

