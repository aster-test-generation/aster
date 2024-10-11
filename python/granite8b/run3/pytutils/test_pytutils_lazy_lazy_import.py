import math
import unittest
from pytutils.lazy.lazy_import import lazy_import
        lazy_import(scope, 'from math import pi')
        self.assertTrue(hasattr(scope, 'pi'))
        lazy_import(scope, 'from math import pi as p')
        self.assertTrue(hasattr(scope, 'p'))
        lazy_import(scope, 'from math import pi, e')
        self.assertTrue(hasattr(scope, 'pi'))
        lazy_import(scope, 'from math import (pi, e)')
        self.assertTrue(hasattr(scope, 'pi'))
        lazy_import(scope, 'from math import (pi as p, e as euler)')
        self.assertTrue(hasattr(scope, 'p'))


class TestLazyImport(unittest.TestCase):
    def test_lazy_import(self):
        scope = {}
        lazy_import(scope, 'import math')
        self.assertTrue(hasattr(scope, 'math'))
        self.assertEqual(scope['math'], math)
        lazy_import(scope, 'import math as m')
        self.assertTrue(hasattr(scope, 'm'))
        self.assertEqual(scope['m'], math)
        self.assertEqual(scope['pi'], math.pi)
        self.assertEqual(scope['p'], math.pi)
        self.assertEqual(scope['pi'], math.pi)
        self.assertTrue(hasattr(scope, 'e'))
        self.assertEqual(scope['e'], math.e)
        self.assertEqual(scope['pi'], math.pi)
        self.assertTrue(hasattr(scope, 'e'))
        self.assertEqual(scope['e'], math.e)
        self.assertEqual(scope['p'], math.pi)
        self.assertTrue(hasattr(scope, 'euler'))
        self.assertEqual(scope['euler'], math.e)

if __name__ == '__main__':
    unittest.main()