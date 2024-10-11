import unittest
import sys
from types import ModuleType
from pytutils.lazy.simple_import import _LazyModuleMarker, NonLocal, make_lazy


class TestLazyModuleMarker(unittest.TestCase):
    def test_instance_creation(self):
        instance = _LazyModuleMarker()
        self.assertIsInstance(instance, _LazyModuleMarker)

class TestNonLocal(unittest.TestCase):
    def test_init(self):
        instance = NonLocal(10)
        self.assertEqual(instance.value, 10)

    def test_value_assignment(self):
        instance = NonLocal(10)
        instance.value = 20
        self.assertEqual(instance.value, 20)

class TestMakeLazy(unittest.TestCase):
    def setUp(self):
        self.module_path = 'os'  # Using 'os' as an example module
        self.original_sys_modules = sys.modules.copy()

    def tearDown(self):
        sys.modules = self.original_sys_modules

    def test_make_lazy(self):
        make_lazy(self.module_path)
        self.assertIsInstance(sys.modules[self.module_path], _LazyModuleMarker)

    def test_lazy_module_loading(self):
        make_lazy(self.module_path)
        lazy_module = sys.modules[self.module_path]
        self.assertIsInstance(lazy_module, _LazyModuleMarker)
        # Accessing an attribute to trigger the actual import
        _ = lazy_module.path
        self.assertIsInstance(sys.modules[self.module_path], ModuleType)

class TestLazyModule(unittest.TestCase):
    def setUp(self):
        self.module_path = 'os'  # Using 'os' as an example module
        self.original_sys_modules = sys.modules.copy()
        make_lazy(self.module_path)
        self.lazy_module = sys.modules[self.module_path]

    def tearDown(self):
        sys.modules = self.original_sys_modules

    def test_mro(self):
        mro = self.lazy_module.__class__.__mro__
        self.assertEqual(mro, (self.lazy_module.__class__, ModuleType))

    def test_getattribute(self):
        # Accessing an attribute to trigger the actual import
        path_attr = self.lazy_module.path
        self.assertTrue(hasattr(sys.modules[self.module_path], 'path'))

if __name__ == '__main__':
    unittest.main()