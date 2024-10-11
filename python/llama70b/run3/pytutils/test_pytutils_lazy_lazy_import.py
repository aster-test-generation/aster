import unittest
from pytutils.lazy.lazy_import import *


class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test_init(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        self.assertEqual(instance.name, 'name')
        self.assertEqual(instance.msg, 'msg')
        self.assertEqual(instance.extra, ': extra')

    def test_format(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg: extra")

    def test_unicode(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg: extra")

    def test_str(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        try:
        self.assertEqual(result, "ScopeReplacer object 'name' was used incorrectly: msg: extra")

    def test_repr(self):
        instance = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        e = Exception()
        self.assertEqual(result, "IllegalUseOfScopeReplacer('name', 'msg', ': extra')")

    def test_eq(self):
        instance1 = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
        instance2 = IllegalUseOfScopeReplacer('name', 'msg', 'extra')
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
        instance = ImportReplacer({}, 'name', ['module', 'path'], 'member', {'child': ('child_path', 'child_member', {})})
        self.assertEqual(instance._import_replacer_children, {'child': ('child_path', 'child_member', {})})
        self.assertEqual(instance._member, 'member')
        self.assertEqual(instance._module_path, ['module', 'path'])

    def test_import(self):
        scope = {'module': {'path': {'member': 'obj'}}}
        instance = ImportReplacer(scope, 'name', ['module', 'path'], 'member', {})
        result = instance._import(scope, 'name')
        self.assertEqual(result, 'obj')

class TestImportProcessor(unittest.TestCase):
    def test_init(self):
        instance = ImportProcessor()
        self.assertEqual(instance.imports, {})
        self.assertEqual(instance._lazy_import_class, ImportReplacer)

    def test_lazy_import(self):
        scope = {}
        text = "import module\nfrom module import member"
        instance = ImportProcessor()
        instance.lazy_import(scope, text)
        self.assertEqual(scope, {'module': {'member': 'module.member'}})

    def test_convert_imports(self):
        scope = {}
        instance = ImportProcessor()
        instance.imports = {'module': (['module'], None, {})}
        instance._convert_imports(scope)
        self.assertEqual(scope, {'module': ImportReplacer(scope, 'module', ['module'], None, {})})

if __name__ == '__main__':
    unittest.main()