import unittest
from unittest.mock import patch
from transformers import SixMovesTransforme


class TestSixMovesTransformer(unittest.TestCase):
    def test_init(self):
        transformer = SixMovesTransformer()
        self.assertEqual(transformer.target, (2, 7))
        self.assertEqual(transformer.rewrites, _get_rewrites())
        self.assertEqual(transformer.dependencies, ['six'])

    @patch('six_moves._get_rewrites')
    def test_get_rewrites(self, mock_get_rewrites):
        transformer = SixMovesTransformer()
        transformer._get_rewrites = mock_get_rewrites
        mock_get_rewrites.return_value = [('path1', 'new_path1'), ('path2', 'new_path2')]
        self.assertEqual(transformer.rewrites, [('path1', 'new_path1'), ('path2', 'new_path2')])

    def test_dependencies(self):
        transformer = SixMovesTransformer()
        self.assertEqual(transformer.dependencies, ['six'])

    def test_target(self):
        transformer = SixMovesTransformer()
        self.assertEqual(transformer.target, (2, 7))

if __name__ == '__main__':
    unittest.main()