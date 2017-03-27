
- https://travis-ci.org/xuwei-k/scalikejdbc-assert-error/jobs/215490618#L393
- https://github.com/scala/scala/blob/v2.12.1/src/compiler/scala/tools/nsc/typechecker/SuperAccessors.scala#L380

```
TREE: scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1))
TRANSFORM: null
TREE: scalikejdbc.`package`.withSQL.apply[A](scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1)))
TRANSFORM: /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
TREE: def test(): Unit = scalikejdbc.`package`.withSQL.apply[A](scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1)))
TRANSFORM: /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
TREE: scala.AnyRef {
  def <init>(): example.Test.type = {
    Test.super.<init>();
    ()
  };
  def bar: scalikejdbc.SQLSyntaxSupport[_] = scala.Predef.???;
  def test(): Unit = scalikejdbc.`package`.withSQL.apply[A](scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1)))
}
TRANSFORM: /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
TREE: object Test extends scala.AnyRef {
  def <init>(): example.Test.type = {
    Test.super.<init>();
    ()
  };
  def bar: scalikejdbc.SQLSyntaxSupport[_] = scala.Predef.???;
  def test(): Unit = scalikejdbc.`package`.withSQL.apply[A](scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1)))
}
TRANSFORM: null
TREE: package example {
  case class Foo extends AnyRef with Product with Serializable {
    <caseaccessor> <paramaccessor> private[this] val value: Int = _;
    <stable> <caseaccessor> <accessor> <paramaccessor> def value: Int = Foo.this.value;
    def <init>(value: Int): example.Foo = {
      Foo.super.<init>();
      ()
    };
    <synthetic> def copy(value: Int = value): example.Foo = new Foo(value);
    <synthetic> def copy$default$1: Int = Foo.this.value;
    override <synthetic> def productPrefix: String = "Foo";
    <synthetic> def productArity: Int = 1;
    <synthetic> def productElement(x$1: Int): Any = {
      case <synthetic> val x1: Int = x$1;
      x1 match {
        case 0 => Foo.this.value
        case _ => throw new IndexOutOfBoundsException(x$1.toString())
      }
    };
    override <synthetic> def productIterator: Iterator[Any] = scala.runtime.ScalaRunTime.typedProductIterator[Any](Foo.this);
    <synthetic> def canEqual(x$1: Any): Boolean = x$1.$isInstanceOf[example.Foo]();
    override <synthetic> def hashCode(): Int = {
      <synthetic> var acc: Int = -889275714;
      acc = scala.runtime.Statics.mix(acc, value);
      scala.runtime.Statics.finalizeHash(acc, 1)
    };
    override <synthetic> def toString(): String = scala.runtime.ScalaRunTime._toString(Foo.this);
    override <synthetic> def equals(x$1: Any): Boolean = Foo.this.eq(x$1.asInstanceOf[Object]).||({
  case <synthetic> val x1: Any = x$1;
  case5(){
    if (x1.isInstanceOf[example.Foo])
      matchEnd4(true)
    else
      case6()
  };
  case6(){
    matchEnd4(false)
  };
  matchEnd4(x: Boolean){
    x
  }
}.&&({
      <synthetic> val Foo$1: example.Foo = x$1.asInstanceOf[example.Foo];
      Foo.this.value.==(Foo$1.value).&&(Foo$1.canEqual(Foo.this))
    }))
  };
  <synthetic> object Foo extends scala.runtime.AbstractFunction1[Int,example.Foo] with Serializable {
    def <init>(): example.Foo.type = {
      Foo.super.<init>();
      ()
    };
    final override <synthetic> def toString(): String = "Foo";
    case <synthetic> def apply(value: Int): example.Foo = new Foo(value);
    case <synthetic> def unapply(x$0: example.Foo): Option[Int] = if (x$0.==(null))
      scala.None
    else
      Some.apply[Int](x$0.value);
    <synthetic> private def readResolve(): Object = example.Foo
  };
  case class MyClass extends AnyRef with Product with Serializable {
    <caseaccessor> <paramaccessor> private[this] val a: Int = _;
    <stable> <caseaccessor> <accessor> <paramaccessor> def a: Int = MyClass.this.a;
    def <init>(a: Int): example.MyClass = {
      MyClass.super.<init>();
      ()
    };
    <synthetic> def copy(a: Int = a): example.MyClass = new MyClass(a);
    <synthetic> def copy$default$1: Int = MyClass.this.a;
    override <synthetic> def productPrefix: String = "MyClass";
    <synthetic> def productArity: Int = 1;
    <synthetic> def productElement(x$1: Int): Any = {
      case <synthetic> val x1: Int = x$1;
      x1 match {
        case 0 => MyClass.this.a
        case _ => throw new IndexOutOfBoundsException(x$1.toString())
      }
    };
    override <synthetic> def productIterator: Iterator[Any] = scala.runtime.ScalaRunTime.typedProductIterator[Any](MyClass.this);
    <synthetic> def canEqual(x$1: Any): Boolean = x$1.$isInstanceOf[example.MyClass]();
    override <synthetic> def hashCode(): Int = {
      <synthetic> var acc: Int = -889275714;
      acc = scala.runtime.Statics.mix(acc, a);
      scala.runtime.Statics.finalizeHash(acc, 1)
    };
    override <synthetic> def toString(): String = scala.runtime.ScalaRunTime._toString(MyClass.this);
    override <synthetic> def equals(x$1: Any): Boolean = MyClass.this.eq(x$1.asInstanceOf[Object]).||({
  case <synthetic> val x1: Any = x$1;
  case5(){
    if (x1.isInstanceOf[example.MyClass])
      matchEnd4(true)
    else
      case6()
  };
  case6(){
    matchEnd4(false)
  };
  matchEnd4(x: Boolean){
    x
  }
}.&&({
      <synthetic> val MyClass$1: example.MyClass = x$1.asInstanceOf[example.MyClass];
      MyClass.this.a.==(MyClass$1.a).&&(MyClass$1.canEqual(MyClass.this))
    }))
  };
  object MyClass extends AnyRef with scalikejdbc.SQLSyntaxSupport[example.MyClass] with Serializable {
    def <init>(): example.MyClass.type = {
      MyClass.super.<init>();
      ()
    };
    case <synthetic> def apply(a: Int): example.MyClass = new MyClass(a);
    case <synthetic> def unapply(x$0: example.MyClass): Option[Int] = if (x$0.==(null))
      scala.None
    else
      Some.apply[Int](x$0.a);
    <synthetic> private def readResolve(): Object = example.MyClass
  };
  object Test extends scala.AnyRef {
    def <init>(): example.Test.type = {
      Test.super.<init>();
      ()
    };
    def bar: scalikejdbc.SQLSyntaxSupport[_] = scala.Predef.???;
    def test(): Unit = scalikejdbc.`package`.withSQL.apply[A](scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1)))
  }
}
java.lang.AssertionError: assertion failed: 
  scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1))
     while compiling: /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
        during phase: superaccessors
     library version: version 2.12.1
    compiler version: version 2.12.1
  reconstructed args: -classpath /home/travis/build/xuwei-k/scalikejdbc-assert-error/target/scala-2.12/classes:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc_2.12/jars/scalikejdbc_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-core_2.12/jars/scalikejdbc-core_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.12.1.jar:/home/travis/.ivy2/cache/org.apache.commons/commons-dbcp2/jars/commons-dbcp2-2.1.1.jar:/home/travis/.ivy2/cache/org.apache.commons/commons-pool2/jars/commons-pool2-2.4.2.jar:/home/travis/.ivy2/cache/commons-logging/commons-logging/jars/commons-logging-1.2.jar:/home/travis/.ivy2/cache/org.slf4j/slf4j-api/jars/slf4j-api-1.7.25.jar:/home/travis/.ivy2/cache/joda-time/joda-time/jars/joda-time-2.9.7.jar:/home/travis/.ivy2/cache/org.joda/joda-convert/jars/joda-convert-1.8.1.jar:/home/travis/.ivy2/cache/org.scala-lang.modules/scala-parser-combinators_2.12/bundles/scala-parser-combinators_2.12-1.0.4.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-interpolation_2.12/jars/scalikejdbc-interpolation_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-interpolation-macro_2.12/jars/scalikejdbc-interpolation-macro_2.12-3.0.0-RC3.jar -bootclasspath /usr/lib/jvm/java-8-oracle/jre/lib/resources.jar:/usr/lib/jvm/java-8-oracle/jre/lib/rt.jar:/usr/lib/jvm/java-8-oracle/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jsse.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jce.jar:/usr/lib/jvm/java-8-oracle/jre/lib/charsets.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jfr.jar:/usr/lib/jvm/java-8-oracle/jre/classes:/home/travis/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.1.jar
  last tree to typer: Ident(x)
       tree position: line 5 of /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
            tree tpe: Boolean
              symbol: value x
   symbol definition: x: Boolean (a TermSymbol)
      symbol package: <none>
       symbol owners: value x
           call site: method test in object Test in package example
== Source file context for tree position ==
     2 case class Foo(value: Int)
     3 
     4 case class MyClass(a: Int)
     5 object MyClass extends scalikejdbc.SQLSyntaxSupport[MyClass]
     6 
     7 object Test {
     8   def bar: scalikejdbc.SQLSyntaxSupport[_] = ???
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:380)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.$anonfun$transformArgs$1(SuperAccessors.scala:112)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer$$Lambda$988/2116490522.apply(Unknown Source)
	at scala.reflect.internal.TreeInfo.$anonfun$mapMethodParamsAndArgs$1$adapted(TreeInfo.scala:232)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer$$Lambda$989/1885675277.apply(Unknown Source)
	at scala.reflect.internal.TreeInfo.foreachMethodParamAndArg(TreeInfo.scala:246)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transformArgs(SuperAccessors.scala:109)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:381)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:71)
	at scala.reflect.internal.Trees.$anonfun$itransform$2(Trees.scala:1367)
	at scala.reflect.internal.Trees$$Lambda$786/484189179.apply(Unknown Source)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.atOwner(SuperAccessors.scala:414)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:25)
	at scala.reflect.internal.Trees.itransform(Trees.scala:1365)
	at scala.reflect.internal.Trees.itransform$(Trees.scala:1340)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2555)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:44)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:389)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:71)
	at scala.reflect.api.Trees$Transformer.$anonfun$transformTrees$1(Trees.scala:2559)
	at scala.reflect.api.Trees$Transformer.transformTrees(Trees.scala:2559)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.$anonfun$transform$4(SuperAccessors.scala:247)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer$$Lambda$985/1732447013.apply(Unknown Source)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.atOwner(SuperAccessors.scala:414)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transformTemplate$1(SuperAccessors.scala:247)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:252)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:71)
	at scala.reflect.api.Trees$Transformer.transformTemplate(Trees.scala:2563)
	at scala.reflect.internal.Trees.$anonfun$itransform$5(Trees.scala:1417)
	at scala.reflect.internal.Trees$$Lambda$807/955593387.apply(Unknown Source)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.atOwner(SuperAccessors.scala:414)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:25)
	at scala.reflect.internal.Trees.itransform(Trees.scala:1416)
	at scala.reflect.internal.Trees.itransform$(Trees.scala:1340)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2555)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:44)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:235)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:71)
	at scala.reflect.api.Trees$Transformer.$anonfun$transformStats$1(Trees.scala:2589)
	at scala.reflect.api.Trees$Transformer.transformStats(Trees.scala:2587)
	at scala.reflect.internal.Trees.$anonfun$itransform$7(Trees.scala:1430)
	at scala.reflect.internal.Trees$$Lambda$806/1837800099.apply(Unknown Source)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.atOwner(SuperAccessors.scala:414)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.atOwner(TypingTransformers.scala:25)
	at scala.reflect.internal.Trees.itransform(Trees.scala:1430)
	at scala.reflect.internal.Trees.itransform$(Trees.scala:1340)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.internal.SymbolTable.itransform(SymbolTable.scala:16)
	at scala.reflect.api.Trees$Transformer.transform(Trees.scala:2555)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.super$transform(TypingTransformers.scala:40)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.$anonfun$transform$2(TypingTransformers.scala:42)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer$$Lambda$805/1483009212.apply(Unknown Source)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.atOwner(SuperAccessors.scala:414)
	at scala.tools.nsc.transform.TypingTransformers$TypingTransformer.transform(TypingTransformers.scala:25)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:389)
	at scala.tools.nsc.typechecker.SuperAccessors$SuperAccTransformer.transform(SuperAccessors.scala:71)
	at scala.tools.nsc.ast.Trees$Transformer.transformUnit(Trees.scala:140)
	at scala.tools.nsc.transform.Transform$Phase.apply(Transform.scala:30)
	at scala.tools.nsc.Global$GlobalPhase.$anonfun$applyPhase$1(Global.scala:416)
	at scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:409)
	at scala.tools.nsc.Global$GlobalPhase.$anonfun$run$1(Global.scala:380)
	at scala.tools.nsc.Global$GlobalPhase.$anonfun$run$1$adapted(Global.scala:380)
	at scala.tools.nsc.Global$GlobalPhase$$Lambda$260/319131353.apply(Unknown Source)
	at scala.collection.Iterator.foreach(Iterator.scala:929)
	at scala.collection.Iterator.foreach$(Iterator.scala:929)
	at scala.collection.AbstractIterator.foreach(Iterator.scala:1406)
	at scala.tools.nsc.Global$GlobalPhase.run(Global.scala:380)
	at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1418)
	at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1403)
	at scala.tools.nsc.Global$Run.compileSources(Global.scala:1398)
	at scala.tools.nsc.Global$Run.compile(Global.scala:1492)
	at xsbt.CachedCompiler0.run(CompilerInterface.scala:116)
	at xsbt.CachedCompiler0.run(CompilerInterface.scala:95)
	at xsbt.CompilerInterface.run(CompilerInterface.scala:26)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:483)
	at sbt.compiler.AnalyzingCompiler.call(AnalyzingCompiler.scala:107)
	at sbt.compiler.AnalyzingCompiler.compile(AnalyzingCompiler.scala:53)
	at sbt.compiler.AnalyzingCompiler.compile(AnalyzingCompiler.scala:47)
	at sbt.compiler.MixedAnalyzingCompiler$$anonfun$compileScala$1$1.apply$mcV$sp(MixedAnalyzingCompiler.scala:50)
	at sbt.compiler.MixedAnalyzingCompiler$$anonfun$compileScala$1$1.apply(MixedAnalyzingCompiler.scala:50)
	at sbt.compiler.MixedAnalyzingCompiler$$anonfun$compileScala$1$1.apply(MixedAnalyzingCompiler.scala:50)
	at sbt.compiler.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:74)
	at sbt.compiler.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:49)
	at sbt.compiler.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:64)
	at sbt.compiler.IC$$anonfun$compileInternal$1.apply(IncrementalCompiler.scala:160)
	at sbt.compiler.IC$$anonfun$compileInternal$1.apply(IncrementalCompiler.scala:160)
	at sbt.inc.IncrementalCompile$$anonfun$doCompile$1.apply(Compile.scala:66)
	at sbt.inc.IncrementalCompile$$anonfun$doCompile$1.apply(Compile.scala:64)
	at sbt.inc.IncrementalCommon.cycle(IncrementalCommon.scala:32)
	at sbt.inc.Incremental$$anonfun$1.apply(Incremental.scala:72)
	at sbt.inc.Incremental$$anonfun$1.apply(Incremental.scala:71)
	at sbt.inc.Incremental$.manageClassfiles(Incremental.scala:99)
	at sbt.inc.Incremental$.compile(Incremental.scala:71)
	at sbt.inc.IncrementalCompile$.apply(Compile.scala:54)
	at sbt.compiler.IC$.compileInternal(IncrementalCompiler.scala:160)
	at sbt.compiler.IC$.incrementalCompile(IncrementalCompiler.scala:138)
	at sbt.Compiler$.compile(Compiler.scala:155)
	at sbt.Compiler$.compile(Compiler.scala:141)
	at sbt.Defaults$.sbt$Defaults$$compileIncrementalTaskImpl(Defaults.scala:879)
	at sbt.Defaults$$anonfun$compileIncrementalTask$1.apply(Defaults.scala:870)
	at sbt.Defaults$$anonfun$compileIncrementalTask$1.apply(Defaults.scala:868)
	at scala.Function1$$anonfun$compose$1.apply(Function1.scala:47)
	at sbt.$tilde$greater$$anonfun$$u2219$1.apply(TypeFunctions.scala:40)
	at sbt.std.Transform$$anon$4.work(System.scala:63)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:228)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:228)
	at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:17)
	at sbt.Execute.work(Execute.scala:237)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:228)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:228)
	at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:159)
	at sbt.CompletionService$$anon$2.call(CompletionService.scala:28)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
[error] (compile:compileIncremental) java.lang.AssertionError: assertion failed: 
[error]   scalikejdbc.update(bar).set().where.eq(MyClass.column.a, Foo(1))
[error]      while compiling: /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
[error]         during phase: superaccessors
[error]      library version: version 2.12.1
[error]     compiler version: version 2.12.1
[error]   reconstructed args: -classpath /home/travis/build/xuwei-k/scalikejdbc-assert-error/target/scala-2.12/classes:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc_2.12/jars/scalikejdbc_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-core_2.12/jars/scalikejdbc-core_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scala-lang/scala-reflect/jars/scala-reflect-2.12.1.jar:/home/travis/.ivy2/cache/org.apache.commons/commons-dbcp2/jars/commons-dbcp2-2.1.1.jar:/home/travis/.ivy2/cache/org.apache.commons/commons-pool2/jars/commons-pool2-2.4.2.jar:/home/travis/.ivy2/cache/commons-logging/commons-logging/jars/commons-logging-1.2.jar:/home/travis/.ivy2/cache/org.slf4j/slf4j-api/jars/slf4j-api-1.7.25.jar:/home/travis/.ivy2/cache/joda-time/joda-time/jars/joda-time-2.9.7.jar:/home/travis/.ivy2/cache/org.joda/joda-convert/jars/joda-convert-1.8.1.jar:/home/travis/.ivy2/cache/org.scala-lang.modules/scala-parser-combinators_2.12/bundles/scala-parser-combinators_2.12-1.0.4.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-interpolation_2.12/jars/scalikejdbc-interpolation_2.12-3.0.0-RC3.jar:/home/travis/.ivy2/cache/org.scalikejdbc/scalikejdbc-interpolation-macro_2.12/jars/scalikejdbc-interpolation-macro_2.12-3.0.0-RC3.jar -bootclasspath /usr/lib/jvm/java-8-oracle/jre/lib/resources.jar:/usr/lib/jvm/java-8-oracle/jre/lib/rt.jar:/usr/lib/jvm/java-8-oracle/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jsse.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jce.jar:/usr/lib/jvm/java-8-oracle/jre/lib/charsets.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jfr.jar:/usr/lib/jvm/java-8-oracle/jre/classes:/home/travis/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.12.1.jar
[error] 
[error]   last tree to typer: Ident(x)
[error]        tree position: line 5 of /home/travis/build/xuwei-k/scalikejdbc-assert-error/Test.scala
[error]             tree tpe: Boolean
[error]               symbol: value x
[error]    symbol definition: x: Boolean (a TermSymbol)
[error]       symbol package: <none>
[error]        symbol owners: value x
[error]            call site: method test in object Test in package example
[error] 
[error] == Source file context for tree position ==
[error] 
[error]      2 case class Foo(value: Int)
[error]      3 
[error]      4 case class MyClass(a: Int)
[error]      5 object MyClass extends scalikejdbc.SQLSyntaxSupport[MyClass]
[error]      6 
[error]      7 object Test {
[error]      8   def bar: scalikejdbc.SQLSyntaxSupport[_] = ???
```
