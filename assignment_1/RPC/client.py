import xmlrpc.client

server = xmlrpc.client.ServerProxy(
    "https://pseudozoological-claretha-unnameable.ngrok-free.dev/"
)

try:
    print("Addition:", server.add(5, 3))
    print("Multiplication:", server.multiply(4, 6))
except Exception as e:
    print("Error:", e)
