mvn clean package
mkdir -p target/dependency
(cd target/dependency || exit ; jar -xf ../*.jar)
docker build -t springboot-sample .
kubectl delete deployment --all
kubectl delete services --all   
kubectl apply -f deployment.yaml