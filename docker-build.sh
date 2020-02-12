mvn clean package
mkdir -p target/dependency
(cd target/dependency || exit ; jar -xf ../*.jar)