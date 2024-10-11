import unittest
from unittest.mock import patch, MagicMock
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name, _RESERVED_NAMES


class TestGetReservedNames(unittest.TestCase):
    @patch('ansible.vars.reserved.Play')
    @patch('ansible.vars.reserved.Role')
    @patch('ansible.vars.reserved.Block')
    @patch('ansible.vars.reserved.Task')
    def test_get_reserved_names_include_private(self, MockTask, MockBlock, MockRole, MockPlay):
        mock_instance = MagicMock()
        mock_instance.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        MockPlay.return_value = mock_instance.configure_mock()
        MockRole.return_value = mock_instance
        MockBlock.return_value = mock_instance
        MockTask.return_value = mock_instance

        result = get_reserved_names(include_private=True)
        self.assertIn('public_attr', result)
        self.assertIn('private_attr', result)

    @patch('ansible.vars.reserved.Play')
    @patch('ansible.vars.reserved.Role')
    @patch('ansible.vars.reserved.Block')
    @patch('ansible.vars.reserved.Task')
    def test_get_reserved_names_exclude_private(self, MockTask, MockBlock, MockRole, MockPlay):
        mock_instance = MagicMock()
        mock_instance.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        MockPlay.return_value = mock_instance
        MockRole.return_value = mock_instance
        MockBlock.return_value = mock_instance
        MockTask.return_value = mock_instance

        result = get_reserved_names(include_private=False)
        self.assertIn('public_attr', result)
        self.assertNotIn('private_attr', result)

class TestWarnIfReserved(unittest.TestCase):
    @patch('ansible.vars.reserved.display')
    def test_warn_if_reserved_with_additional(self, mock_display):
        myvars = {'vars': 'value', 'reserved_var': 'value'}
        additional = {'reserved_var'}
        warn_if_reserved(myvars, additional)
        mock_display.warning.assert_called_with('Found variable using reserved name: reserved_var')

    @patch('ansible.vars.reserved.display')
    def test_warn_if_reserved_without_additional(self, mock_display):
        myvars = {'vars': 'value', 'reserved_var': 'value'}
        warn_if_reserved(myvars)
        mock_display.warning.assert_not_called()

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name_true(self):
        reserved_name = next(iter(_RESERVED_NAMES))
        result = is_reserved_name(reserved_name)
        self.assertTrue(result)

    def test_is_reserved_name_false(self):
        result = is_reserved_name('non_reserved_name')
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()