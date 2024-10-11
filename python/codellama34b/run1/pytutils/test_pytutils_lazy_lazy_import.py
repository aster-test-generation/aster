import unittest
from pytutils.lazy.lazy_import import *



class TestIllegalUseOfScopeReplacer(unittest.TestCase):
    def test___init__(self):
        instance = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(instance.name, name)
        self.assertEqual(instance.msg, msg)
        self.assertEqual(instance.extra, extra)

    def test___eq__(self):
        instance = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(instance.__eq__(other), NotImplemented)

    def test___format__(self):
        instance = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(instance.__format__(), 'Unprintable exception %s: dict=%r, fmt=%r, error=%r')

    def test___str__(self):
        instance = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(instance.__str__(), 'Unprintable exception %s: dict=%r, fmt=%r, error=%r')

    def test___repr__(self):
        instance = IllegalUseOfScopeReplacer(name, msg, extra)
        self.assertEqual(instance.__repr__(), 'IllegalUseOfScopeReplacer(%s)' % str(instance))

class TestScopeReplacer(unittest.TestCase):
    def test___init__(self):
        instance = ScopeReplacer(scope, factory, name)
        self.assertEqual(instance.scope, scope)
        self.assertEqual(instance.factory, factory)
        self.assertEqual(instance.name, name)
        self.assertEqual(instance.real_obj, None)
        self.assertEqual(scope[name], instance)

    def test___getattribute__(self):
        instance = ScopeReplacer(scope, factory, name)
        self.assertEqual(instance.__getattribute__(attr), getattr(obj, attr))

    def test___setattr__(self):
        instance = ScopeReplacer(scope, factory, name)
        self.assertEqual(instance.__setattr__(attr, value), setattr(obj, attr, value))

    def test___call__(self):
        instance = ScopeReplacer(scope, factory, name)
        self.assertEqual(instance.__call__(*args, **kwargs), obj(*args, **kwargs))

    def test__resolve(self):
        instance = ScopeReplacer(scope, factory, name)
        self.assertEqual(instance._resolve(), obj)

class TestImportReplacer(unittest.TestCase):
    def test___init__(self):
        instance = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(instance.scope, scope)
        self.assertEqual(instance.name, name)
        self.assertEqual(instance.module_path, module_path)
        self.assertEqual(instance.member, member)
        self.assertEqual(instance.children, children)
        self.assertEqual(scope[name], instance)

    def test___call__(self):
        instance = ImportReplacer(scope, name, module_path, member, children)
        self.assertEqual(instance.__call__(scope, name), obj)

class TestImportProcessor(unittest.TestCase):
    def test___init__(self):
        instance = ImportProcessor(lazy_import_class)
        self.assertEqual(instance.imports, {})
        self.assertEqual(instance._lazy_import_class, lazy_import_class)

    def test_lazy_import(self):
        instance = ImportProcessor(lazy_import_class)
        self.assertEqual(instance.lazy_import(scope, text), None)

    def test__convert_imports(self):
        instance = ImportProcessor(lazy_import_class)
        self.assertEqual(instance._convert_imports(scope), None)

    def test__build_map(self):
        instance = ImportProcessor(lazy_import_class)
        self.assertEqual(instance._build_map(text), None)

if __name__ == '__main__':
    unittest.main()