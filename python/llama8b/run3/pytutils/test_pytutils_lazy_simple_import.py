import unittest
import sys
from types import ModuleType
from pytutils import make_laz


class TestLazyModule(unittest.TestCase):
    def test_make_lazy(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        self.assertIsInstance(lazy_module, _LazyModuleMarker)
        self.assertIsInstance(lazy_module, ModuleType)

    def test_lazy_module_getattr(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        module = sys.modules[module_path]
        self.assertEqual(module, lazy_module)

    def test_lazy_module_getattr_called(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        module = sys.modules[module_path]
        module.value = sys.modules[module_path]
        self.assertEqual(getattr(module, 'value'), sys.modules[module_path])

    def test_lazy_module_getattr_not_called(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        module = sys.modules[module_path]
        self.assertEqual(getattr(module, 'value'), None)

    def test_lazy_module_getattr_called_twice(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        module = sys.modules[module_path]
        module.value = sys.modules[module_path]
        self.assertEqual(getattr(module, 'value'), sys.modules[module_path])

    def test_lazy_module_getattr_called_twice_again(self):
        module_path = 'test_module'
        lazy_module = make_lazy(module_path)
        module = sys.modules[module_path]
        module.value = sys.modules[module_path]
        self.assertEqual(getattr(module, 'value'), sys.modules[module_path])

if __name__ == '__main__':
    unittest.main()