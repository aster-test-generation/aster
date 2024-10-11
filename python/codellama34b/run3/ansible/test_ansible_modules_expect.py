import unittest
from ansible.modules.expect import *


class TestExpectModule(unittest.TestCase):
    def test_expect_module(self):
        instance = expect_module.ExpectModule()
        result = instance.main()
        self.assertEqual(result, )

    def test_response_closure(self):
        instance = expect_module.ExpectModule()
        result = instance._response_closure()
        self.assertEqual(result, )

    def test_main(self):
        instance = expect_module.ExpectModule()
        result = instance.main()
        self.assertEqual(result, )

if __name__ == '__main__':
    unittest.main()