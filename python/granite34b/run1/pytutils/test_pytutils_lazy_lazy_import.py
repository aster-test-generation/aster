import unittest
from pytutils.lazy.lazy_import import *


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")
        self.assertEqual(e.name, "name")
        self.assertEqual(e.msg, "msg")
        self.assertEqual(e.extra, ": extra")

    def test_format(self):
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")
        self.assertEqual(e._format(), "ScopeReplacer object name was used incorrectly: msg: extra")

    def test_unicode(self):
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")
        self.assertEqual(e.__unicode__(), "ScopeReplacer object name was used incorrectly: msg: extra")

    def test_str(self):
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")
        self.assertEqual(e.__str__(), "ScopeReplacer object name was used incorrectly: msg: extra")

    def test_repr(self):
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")
        e = IllegalUseOfScopeReplacer("name", "msg", "extra")

    def test_eq(self):
        e1 = IllegalUseOfScopeReplacer("name", "msg", "extra")
        e2 = IllegalUseOfScopeReplacer("name", "msg", "extra")
        self.assertEqual(e1, e2)

class TestScopeReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        factory = lambda: "factory"
        name = "name"
        r = ScopeReplacer(scope, factory, name)
        self.assertEqual(r._scope, scope)
        self.assertEqual(r._factory, factory)
        self.assertEqual(r._name, name)
        self.assertEqual(r._real_obj, None)
        self.assertEqual(scope[name], r)

    def test_resolve(self):
        scope = {}
        factory = lambda: "factory"
        name = "name"
        r = ScopeReplacer(scope, factory, name)
        self.assertEqual(r._resolve(), "factory")

    def test_getattribute(self):
        scope = {}
        factory = lambda: "factory"
        name = "name"
        r = ScopeReplacer(scope, factory, name)
        self.assertEqual(r.__getattribute__("_resolve"), "factory")

    def test_setattr(self):
        scope = {}
        factory = lambda: "factory"
        name = "name"
        r = ScopeReplacer(scope, factory, name)
        r.__setattr__("_resolve", "new_value")
        self.assertEqual(r._resolve, "new_value")

    def test_call(self):
        scope = {}
        factory = lambda: "factory"
        name = "name"
        r = ScopeReplacer(scope, factory, name)
        self.assertEqual(r(), "factory")

class TestImportReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        name = "name"
        module_path = ["module", "path"]
        member = "member"
        children = {"child": (["child", "path"], "child_member", {})}
        r = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(r._import_replacer_children, children)
        self.assertEqual(r._member, member)
        self.assertEqual(r._module_path, module_path)

    def test_import(self):
        scope = {}
        name = "name"
        module_path = ["module", "path"]
        member = "member"
        children = {"child": (["child", "path"], "child_member", {})}
        r = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(r._import(scope, name), "module.path.member")

class TestImportProcessor(unittest.TestCase):
    def test_lazy_import(self):
        scope = {}
        text = "import module\nfrom module import member"
        proc = ImportProcessor()
        proc.lazy_import(scope, text)
        self.assertEqual(scope["module"], "module")
        self.assertEqual(scope["member"], "module.member")

if __name__ == '__main__':
    unittest.main()