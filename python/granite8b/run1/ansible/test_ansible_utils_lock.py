import unittest
from ansible.utils.lock import lock_decorator


class TestLockDecorator(unittest.TestCase):
    def test_lock_decorator_with_attr(self):
        @lock_decorator(attr='_lock')
        def test_method():
            pass
        instance = type('Test', (), {'_lock': None})()
        test_method(instance)

    def test_lock_decorator_with_lock(self):
        lock = object()
        @lock_decorator(lock=lock)
        def test_method():
            pass
        test_method()

    def test_lock_decorator_with_kwargs(self):
        @lock_decorator(attr='_lock')
        def test_method(self, arg1, arg2):
            pass
        instance = type('Test', (), {'_lock': None})()
        test_method(instance, 'arg1', 'arg2')

    def test_lock_decorator_with_magic_methods(self):
        @lock_decorator(attr='_lock')
        def test_method(self):
            pass
        instance = type('Test', (), {'_lock': None, '__str__': lambda self: 'Test'})()
        test_method(instance)

if __name__ == '__main__':
    unittest.main()