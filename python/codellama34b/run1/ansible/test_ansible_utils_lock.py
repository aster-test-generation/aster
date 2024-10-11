import unittest
from ansible.utils.lock import *


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator(self):
        result = lock_decorator()
        self.assertEqual(result, lock_decorator(func))

    def test_outer(self):
        result = outer()
        self.assertEqual(result, None)

    def test_inner(self):
        result = inner()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()