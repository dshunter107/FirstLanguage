cd src/antlr
java org.antlr.v4.Tool -visitor Expr.g4
javac -g *.java
cd ..
java -cp ".;C:\Users\david\Antlr\Antlr4\antlr-4.13.1-complete.jar" org.antlr.v4.gui.TestRig antlr.Expr prog tests/test1.txt -gui -tree
cd ..