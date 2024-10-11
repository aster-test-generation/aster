import unittest
from pytutils.lazy import *


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(replacer.name, 'name')
        self.assertEqual(replacer.msg, 'msg')

    def test_format(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(replacer._format(), 'ScopeReplacer object name was used incorrectly: msg')

    def test_unicode(self):
        replacer = IllegalUseOfScopeReplacer('name', 'msg')
        self.assertEqual(replacer.__unicode__(), 'ScopeReplacer object name was used incorrectly: msg')

    def test_str(self):
        replacer = IllegalUseOfScopeReplacer('name', 'msg')
        self.assertEqual(replacer.__str__(), 'ScopeReplacer object name was used incorrectly: msg')

    def test_repr(self):
        from your_module import IllegalUseOfScopeReplacer
        self.assertEqual(replacer.__repr__(), 'IllegalUseOfScopeReplacer(name, msg)')

    def test_eq(self):
        replacer1 = ScopeReplacer('name1', 'msg1'
        replacer2 = IllegalUseOfScopeReplacer('name2', 'msg2')
        self.assertEqual(replacer1, replacer1)
        self.assertNotEqual(replacer1, replacer2)
        self.assertNotEqual(replacer1, 'not a replacer')

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
        self.assertEqual(obj, replacer)

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

class TestImportProcessor(unittest.TestCase):
    def test_lazy_import(self):
        scope = {}
        text = 'import module1\nimport module2'
        processor = ImportProcessor()
        processor.lazy_import(scope, text)
        self.assertIn('module1', scope)
        self.assertIn('module2', scope)

    def test_build_map(self):
        processor = ImportProcessor()
        text = 'import module1\nimport module2'
        processor._build_map(text)
        self.assertIn('module1', processor.imports)
        self.assertIn('module2', processor.imports)

    def test_convert_import_str(self):
        processor = ImportProcessor()
        text = 'import module1 as m1, module2 as m2'
        processor._convert_import_str(text)
        self.assertIn('m1', processor.imports)
        self.assertIn('m2', processor.imports)

if __name__ == '__main__':
    unittest.main()