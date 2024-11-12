## Gradle
### Build project
`./gradlew clean build`

### Build image
`./gradlew bootBuildImage --imageName=dukov82/hello`

### Push image
`docker login`
`docker push dukov82/hello`


## K8s
# K8s with kind
`kind delete cluster --name whatever`
`kind get clusters`

### Deploy to Kubernetes
`kubectl cluster-info --context kind-spring-boot-cluster`
`kubectl apply -f deployment.yaml`
`kubectl port-forward service/hello-k8s-svc 9090:8080`

An alternative if you don't want to do port-forwarding is this
login into the docker container id that is running your kind cluster
`docker exec -it <kind-node-container-id> /bin/bash`
then you can crul:
`curl http://localhost:32751/hello`


