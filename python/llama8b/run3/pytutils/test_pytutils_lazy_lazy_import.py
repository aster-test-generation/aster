import unittest
from pytutils.lazy import *
        self.assertEqual(processor._canonicalize_import_text(text), ['import module', 'from module import member'])


if __name__ == '__main__':
    unittest.main()

class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(replacer.name, 'name')
        self.assertEqual(replacer.msg, 'msg')

    def test_str(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(str(replacer), 'IllegalUseOfScopeReplacer(name=name, msg=msg)')

    def test_repr(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(repr(replacer), 'IllegalUseOfScopeReplacer(name=name, msg=msg)')

    def test_eq(self):
        replacer1 = ScopeReplacer('name1', 'msg1'
        replacer2 = IllegalUseOfScopeReplacer('name1', 'msg1')
        self.assertTrue(replacer1 == replacer2)

class TestScopeReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        factory = lambda x: x
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        self.assertEqual(replacer._scope, scope)
        self.assertEqual(replacer._factory, factory)
        self.assertEqual(replacer._name, name)
        self.assertIsNone(replacer._real_obj)

    def test_resolve(self):
        scope = {}
        factory = lambda x: x
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        self.assertEqual(replacer._resolve(), replacer)

    def test_getattribute(self):
        scope = {}
        factory = lambda x: x
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        obj = replacer._resolve()
        self.assertEqual(obj.__class__, replacer.__class__)

    def test_setattribute(self):
        scope = {}
        factory = lambda x: x
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        obj = replacer._resolve()
        obj.x = 1
        self.assertEqual(obj.x, 1)

    def test_call(self):
        scope = {}
        factory = lambda x: x
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        obj = replacer._resolve()
        self.assertEqual(obj(), obj)

class TestImportReplacer(unittest.TestCase):
    def test_init(self):
        scope = {}
        name = 'name'
        module_path = ['module', 'path']
        member = 'member'
        children = {}
        replacer = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(replacer._import_replacer_children, children)
        self.assertEqual(replacer._member, member)
        self.assertEqual(replacer._module_path, module_path)

    def test_import(self):
        scope = {}
        name = 'name'
        module_path = ['module', 'path']
        member = 'member'
        children = {}
        replacer = ImportReplacer(scope, name, module_path, member, children)
        module = replacer._import(scope, name)
        self.assertEqual(module, module_path)

if __name__ == '__main__':
    unittest.main()