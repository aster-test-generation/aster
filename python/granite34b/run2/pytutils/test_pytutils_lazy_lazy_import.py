import unittest
from pytutils.lazy.lazy_import import *


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj.name, name)
        self.assertEqual(obj.msg, msg)
        self.assertEqual(obj.extra, ': ' + extra)

    def test_format(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        s = obj._format()
        self.assertEqual(s, f"ScopeReplacer object {name!r} was used incorrectly: {msg}{extra}")

    def test_unicode(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        try:
        self.assertEqual(u, f"ScopeReplacer object {name!r} was used incorrectly: {msg}{extra}")

    def test_str(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        s = obj.__str__()
        self.assertEqual(s, f"ScopeReplacer object {name!r} was used incorrectly: {msg}{extra}")

    def test_repr(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        def test_repr(self):
        self.assertEqual(r, f"IllegalUseOfScopeReplacer({name!r}, {msg!r}, {extra!r})")

    def test_eq(self):
        name = 'test_name'
        msg = 'test_msg'
        extra = 'test_extra'
        obj1 = IllegalUseOfScopeReplacer(name, msg, extra)
        obj2 = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj1, obj2)

class TestScopeReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        factory = lambda: None
        name = 'test_name'
        obj = ScopeReplacer(scope, factory, name)
        self.assertEqual(obj._scope, scope)
        self.assertEqual(obj._factory, factory)
        self.assertEqual(obj._name, name)
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

    def test_resolve(self):
        scope = {}
        factory = lambda: 1
        name = 'test_name'
        obj = ScopeReplacer(scope, factory, name)
        result = obj._resolve()
        self.assertEqual(result, 1)

    def test_getattribute(self):
        scope = {}
        factory = lambda: ExampleClass()
        name = 'test_name'
        obj = ScopeReplacer(scope, factory, name)
        result = obj.method_one(1)
        self.assertEqual(result, 2)

    def test_setattr(self):
        scope = {}
        factory = lambda: ExampleClass()
        name = 'test_name'
        obj = ScopeReplacer(scope, factory, name)
        obj.method_one = lambda x: x + 2
        result = obj.method_one(1)
        self.assertEqual(result, 3)

    def test_call(self):
        scope = {}
        factory = lambda: ExampleClass()
        name = 'test_name'
        obj = ScopeReplacer(scope, factory, name)
        result = obj(1, 2, 3)
        self.assertEqual(result, 6)


if __name__ == '__main__':
    unittest.main()