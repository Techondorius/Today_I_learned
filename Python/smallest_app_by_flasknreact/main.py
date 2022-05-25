from flask import Flask
from flask_restful import Resource, Api

app = Flask(__name__)
api = Api(app)

class Noot(Resource):
    def get(self):
        return {"message":"got noot"}

# CORSに引っかかるので対策
@app.after_request
def set_cors_header(response):
    クライアント側のアドレスとポート = 'http://localhost:3000'
    response.headers['Access-Control-Allow-Origin'] = クライアント側のアドレスとポート
    response.headers['Access-Control-Allow-Method'] = 'GET, POST, PUT, PATCH, DELETE, HEAD, OPTIONS'  # noqa: E501
    response.headers['Access-Control-Allow-Headers'] = 'Content-type,Accept,X-Custom-Header'  # noqa: E501
    response.headers['Access-Control-Allow-Credentials'] = 'true'
    response.headers['Access-Control-Max-Age'] = '86400'
    return response

api.add_resource(Noot, "/noot")

if __name__ == '__main__':
    app.run(debug=True)