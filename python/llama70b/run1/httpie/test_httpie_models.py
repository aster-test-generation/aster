import unittest
from httpie.models import HTTPMessage, HTTPResponse, HTTPRequest


class TestHTTPMessage(unittest.TestCase):
    def test_init(self):
        instance = HTTPMessage("orig")
        self.assertEqual(instance._orig, "orig")

    def test_iter_body(self):
        instance = HTTPMessage("orig")
        with self.assertRaises(NotImplementedError):
            instance.iter_body(1)

    def test_iter_lines(self):
        instance = HTTPMessage("orig")
        with self.assertRaises(NotImplementedError):
            instance.iter_lines(1)

    def test_headers(self):
        instance = HTTPMessage("orig")
        with self.assertRaises(NotImplementedError):
            instance.headers

    def test_encoding(self):
        instance = HTTPMessage("orig")
        with self.assertRaises(NotImplementedError):
            instance.encoding

    def test_body(self):
        instance = HTTPMessage("orig")
        with self.assertRaises(NotImplementedError):
            instance.body

    def test_content_type(self):
        instance = HTTPMessage("orig")
        self.assertEqual(instance.content_type, "")

class TestHTTPResponse(unittest.TestCase):
    def test_init(self):
        instance = HTTPResponse("orig")
        self.assertEqual(instance._orig, "orig")

    def test_iter_body(self):
        instance = HTTPResponse("orig")
        result = instance.iter_body(1)
        self.assertIsNotNone(result)

    def test_iter_lines(self):
        instance = HTTPResponse("orig")
        result = instance.iter_lines(1)
        self.assertIsNotNone(result)

    def test_headers(self):
        instance = HTTPResponse("orig")
        result = instance.headers
        self.assertIsNotNone(result)

    def test_encoding(self):
        instance = HTTPResponse("orig")
        result = instance.encoding
        self.assertIsNotNone(result)

    def test_body(self):
        instance = HTTPResponse("orig")
        result = instance.body
        self.assertIsNotNone(result)

class TestHTTPRequest(unittest.TestCase):
    def test_init(self):
        instance = HTTPRequest("orig")
        self.assertEqual(instance._orig, "orig")

    def test_iter_body(self):
        instance = HTTPRequest("orig")
        result = instance.iter_body(1)
        self.assertIsNotNone(result)

    def test_iter_lines(self):
        instance = HTTPRequest("orig")
        result = instance.iter_lines(1)
        self.assertIsNotNone(result)

    def test_headers(self):
        instance = HTTPRequest("orig")
        result = instance.headers
        self.assertIsNotNone(result)

    def test_encoding(self):
        instance = HTTPRequest("orig")
        result = instance.encoding
        self.assertEqual(result, "utf8")

    def test_body(self):
        instance = HTTPRequest("orig")
        result = instance.body
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()