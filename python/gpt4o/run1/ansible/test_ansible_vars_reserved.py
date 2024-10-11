import unittest
from unittest.mock import patch, MagicMock
from ansible.vars.reserved import get_reserved_names, warn_if_reserved, is_reserved_name, _RESERVED_NAMES


class TestGetReservedNames(unittest.TestCase):
    @patch('ansible.vars.reserved.Play')
    @patch('ansible.vars.reserved.Role')
    @patch('ansible.vars.reserved.Block')
    @patch('ansible.vars.reserved.Task')
    def test_get_reserved_names_include_private(self, mock_task, mock_block, mock_role, mock_play):
        mock_task.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_block.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_role.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_play.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        
        result = get_reserved_names(include_private=True)
        expected = {'public_attr', 'private_attr', 'local_action', 'with_'}
        self.assertSetEqual(result, expected)

    @patch('ansible.vars.reserved.Play')
    @patch('ansible.vars.reserved.Role')
    @patch('ansible.vars.reserved.Block')
    @patch('ansible.vars.reserved.Task')
    def test_get_reserved_names_exclude_private(self, mock_task, mock_block, mock_role, mock_play):
        mock_task.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_block.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_role.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        mock_play.return_value.__dict__ = {'_attributes': ['public_attr', 'private_attr']}
        
        result = get_reserved_names(include_private=False)
        expected = {'public_attr', 'local_action', 'with_'}
        self.assertSetEqual(result, expected)

class TestWarnIfReserved(unittest.TestCase):
    @patch('ansible.vars.reserved.display')
    def test_warn_if_reserved_no_additional(self, mock_display):
        myvars = {'vars': 'value', 'reserved_name': 'value'}
        _RESERVED_NAMES = frozenset(['reserved_name'])
        
        warn_if_reserved(myvars)
        mock_display.warning.assert_called_once_with('Found variable using reserved name: reserved_name')

    @patch('ansible.vars.reserved.display')
    def test_warn_if_reserved_with_additional(self, mock_display):
        myvars = {'vars': 'value', 'additional_reserved': 'value'}
        additional = {'additional_reserved'}
        
        warn_if_reserved(myvars, additional)
        mock_display.warning.assert_called_once_with('Found variable using reserved name: additional_reserved')

class TestIsReservedName(unittest.TestCase):
    def test_is_reserved_name_true(self):
        name = 'reserved_name'
        _RESERVED_NAMES = frozenset(['reserved_name'])
        
        result = is_reserved_name(name)
        self.assertTrue(result is True)

    def test_is_reserved_name_false(self):
        name = 'not_reserved'
        _RESERVED_NAMES = frozenset(['reserved_name'])
        
        result = is_reserved_name(name)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()