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
        factory = lambda self, scope, name: None
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        self.assertEqual(replacer._scope, scope)
        self.assertEqual(replacer._factory, factory)
        self.assertEqual(replacer._name, name)
        self.assertIsNone(replacer._real_obj)

    def test_resolve(self):
        scope = {}
        factory = lambda self, scope, name: None
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        self.assertIsNone(replacer._real_obj)
        replacer._real_obj = None
        self.assertIsNone(replacer._real_obj)
        replacer._real_obj = object()
        self.assertEqual(replacer._real_obj, object())

    def test_getattribute(self):
        scope = {}
        factory = lambda self, scope, name: None
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        replacer._real_obj = object()
        self.assertEqual(replacer.__getattribute__('attr'), getattr(replacer._real_obj, 'attr'))

    def test_setattribute(self):
        scope = {}
        factory = lambda self, scope, name: None
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        replacer._real_obj = object()
        replacer.__setattr__('attr', 'value')
        self.assertEqual(getattr(replacer._real_obj, 'attr'), 'value')

    def test_call(self):
        scope = {}
        factory = lambda self, scope, name: None
        name = 'name'
        replacer = ScopeReplacer(scope, factory, name)
        replacer._real_obj = object()
        self.assertEqual(replacer(), replacer._real_obj())

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
        self.assertEqual(replacer._import(scope, name), None)

class TestImportProcessor(unittest.TestCase):
    def test_init(self):
        processor = ImportProcessor()
        self.assertEqual(processor.imports, {})
        self.assertEqual(processor._lazy_import_class, ImportReplacer)

    def test_lazy_import(self):
        scope = {}
        text = 'import module\nfrom module import member'
        processor = ImportProcessor()
        processor.lazy_import(scope, text)
        self.assertEqual(len(processor.imports), 2)

    def test_build_map(self):
        processor = ImportProcessor()
        text = 'import module\nfrom module import member'
        processor._build_map(text)
        self.assertEqual(len(processor.imports), 2)

if __name__ == '__main__':
    unittest.main()