# Switch namespace
kubectl config set-context --current --namespace=client-service-ns-dev
# Validate it
kubectl config view --minify | grep namespace:

kubectl apply -f mysql-secret.yaml --namespace=client-service-ns-dev
kubectl apply -f mysql-storage.yaml --namespace=client-service-ns-dev
kubectl apply -f mysql-deployment.yaml --namespace=client-service-ns-dev
