import unittest
import sys
from types import ModuleType
from pytutils.lazy import _LazyModuleMarke


class TestMakeLazy(unittest.TestCase):
    def test_make_lazy(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertIsInstance(lazy_module, _LazyModuleMarker)
        self.assertIsInstance(lazy_module, ModuleType)

    def test_make_lazy_import(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertEqual(lazy_module.__name__, module_path)
        self.assertEqual(lazy_module.__package__, module_path)

    def test_make_lazy_getattr(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        lazy_module.value = sys.modules[module_path] = type('TestModule', (), {'test_function': lambda: 'test_result'})
        self.assertEqual(lazy_module.test_function(), 'test_result')

    def test_make_lazy_getattr_not_imported(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        with self.assertRaises(ImportError):
            lazy_module.test_function()

    def test_make_lazy_getattr_imported(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        lazy_module.value = sys.modules[module_path] = type('TestModule', (), {'test_function': lambda: 'test_result'})
        self.assertEqual(lazy_module.test_function(), 'test_result')

    def test_make_lazy_del(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        del sys.modules[module_path]
        with self.assertRaises(ImportError):
            lazy_module.test_function()

if __name__ == '__main__':
    unittest.main()