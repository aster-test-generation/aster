import unittest
from ansible.utils.lock import *


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator(self):
        result = lock_decorator(attr='missing_lock_attr', lock=None)
        self.assertEqual(result, lock_decorator(func))

    def test_outer(self):
        result = outer(func)
        self.assertEqual(result, None)

    def test_inner(self):
        result = inner(self, *args, **kwargs)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()