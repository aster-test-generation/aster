import unittest
from pytutils.lazy.lazy_import import *


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj.name, name)
        self.assertEqual(obj.msg, msg)
        self.assertEqual(obj.extra, ": " + extra)

    def test_format(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj._format(), "ScopeReplacer object test was used incorrectly: message: extra")

    def test_unicode(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj.__unicode__(), "ScopeReplacer object test was used incorrectly: message: extra")

    def test_str(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj.__str__(), "ScopeReplacer object test was used incorrectly: message: extra")

    def test_repr(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj.__repr__(), "IllegalUseOfScopeReplacer('test', 'message', 'extra')")

    def test_eq(self):
        name = "test"
        msg = "message"
        extra = "extra"
        obj1 = IllegalUseOfScopeReplacer(name, msg, extra)
        obj2 = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(obj1, obj2)

class TestScopeReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        factory = lambda: None
        name = "test"
        obj = ScopeReplacer(scope, factory, name)
        self.assertEqual(obj._scope, scope)
        self.assertEqual(obj._factory, factory)
        self.assertEqual(obj._name, name)
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

    def test_resolve(self):
        scope = {}
        factory = lambda: None
        name = "test"
        obj = ScopeReplacer(scope, factory, name)
        obj._resolve()
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

    def test_getattribute(self):
        scope = {}
        factory = lambda: None
        name = "test"
        obj = ScopeReplacer(scope, factory, name)
        obj._resolve()
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

    def test_setattr(self):
        scope = {}
        factory = lambda: None
        name = "test"
        obj = ScopeReplacer(scope, factory, name)
        obj._resolve()
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

    def test_call(self):
        scope = {}
        factory = lambda: None
        name = "test"
        obj = ScopeReplacer(scope, factory, name)
        obj._resolve()
        self.assertEqual(obj._real_obj, None)
        self.assertEqual(scope[name], obj)

class TestImportReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        name = "test"
        module_path = ["module"]
        member = "member"
        children = {}
        obj = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(obj._import_replacer_children, children)
        self.assertEqual(obj._member, member)
        self.assertEqual(obj._module_path, module_path)

    def test_import(self):
        scope = {}
        name = "test"
        module_path = ["module"]
        member = "member"
        children = {}
        obj = ImportReplacer(scope, name, module_path, member, children)
        result = obj._import(scope, name)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()