import unittest
from pytutils.lazy.lazy_import import *
        result = instance._canonicalize_import_text('import module\nfrom path import obj')
        self.assertEqual(result, ['import module', 'from path import obj'])

class TestLazyImport(unittest.TestCase):


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg')
        self.assertEqual(instance.name, 'name')
        self.assertEqual(instance.msg, 'msg')
        self.assertEqual(instance.extra, '')

    def test_format(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg")

    def test_unicode(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg")

    def test_str(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg")

    def test_repr(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg')
        e = Exception()
        self.assertEqual(result, "IllegalUseOfScopeReplacer('name', 'msg')")

    def test_eq(self):
        instance1 = IllegalUseOfScopeReplacer('name', 'msg')
        instance2 = IllegalUseOfScopeReplacer('name', 'msg')
        self.assertTrue(instance1 == instance2)

class TestScopeReplacer(unittest.TestCase):
    def test_init(self):
        instance = ScopeReplacer({}, lambda x, y, z: None, 'name')
        self.assertEqual(instance._scope, {})
        self.assertEqual(instance._factory, lambda x, y, z: None)
        self.assertEqual(instance._name, 'name')
        self.assertEqual(instance._real_obj, None)

    def test_resolve(self):
        scope = {'name': 'obj'}
        instance = ScopeReplacer(scope, lambda x, y, z: 'obj', 'name')
        result = instance._resolve()
        self.assertEqual(result, 'obj')

    def test_getattribute(self):
        scope = {'name': 'obj'}
        instance = ScopeReplacer(scope, lambda x, y, z: 'obj', 'name')
        result = instance.__getattribute__('attr')
        self.assertEqual(result, 'obj.attr')

    def test_setattr(self):
        scope = {'name': 'obj'}
        instance = ScopeReplacer(scope, lambda x, y, z: 'obj', 'name')
        instance.__setattr__('attr', 'value')
        self.assertEqual(instance._real_obj.attr, 'value')

    def test_call(self):
        scope = {'name': 'obj'}
        instance = ScopeReplacer(scope, lambda x, y, z: 'obj', 'name')
        result = instance.__call__('arg1', 'arg2')
        self.assertEqual(result, 'obj(arg1, arg2)')

class TestImportReplacer(unittest.TestCase):
    def test_init(self):
        instance = ImportReplacer({}, 'name', ['module', 'path'])
        self.assertEqual(instance._import_replacer_children, {})
        self.assertEqual(instance._member, None)
        self.assertEqual(instance._module_path, ['module', 'path'])

    def test_import(self):
        scope = {'name': 'module'}
        instance = ImportReplacer(scope, 'name', ['module', 'path'])
        result = instance._import(scope, 'name')
        self.assertEqual(result, 'module.path')

class TestImportProcessor(unittest.TestCase):
    def test_init(self):
        instance = ImportProcessor()
        self.assertEqual(instance.imports, {})
        self.assertEqual(instance._lazy_import_class, ImportReplacer)

    def test_lazy_import(self):
        scope = {}
        instance = ImportProcessor()
        instance.lazy_import(scope, 'import module')
        self.assertEqual(instance.imports, {'module': (['module'], None, {})})

    def test_convert_imports(self):
        scope = {}
        instance = ImportProcessor()
        instance.imports = {'module': (['module'], None, {})}
        instance._convert_imports(scope)
        self.assertEqual(scope, {'module': 'module'})

    def test_build_map(self):
        instance = ImportProcessor()
        instance._build_map('import module')
        self.assertEqual(instance.imports, {'module': (['module'], None, {})})

    def test_canonicalize_import_text(self):
        instance = ImportProcessor()
    def test_lazy_import(self):
        scope = {}
        lazy_import(scope, 'import module')
        self.assertEqual(scope, {'module': 'module'})

if __name__ == '__main__':
    unittest.main()